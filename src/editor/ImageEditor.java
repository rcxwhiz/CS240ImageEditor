package editor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ImageEditor
{
	public static void main(String[] args) throws IOException
	{
		String inFile = args[0];
		String outFile = args[1];
		String command = args[2];

		// make scanner from file
		Scanner scanner = new Scanner(new File(inFile));
		String p3tag = scanner.next();
		if (!p3tag.toLowerCase().equals("p3"))
		{
			System.out.println("There was no P3 tag on the file");
		}
		scanner.useDelimiter("\\s*#.*\n\\s*|\\s+");

		// read file
		int width = scanner.nextInt();
		int height = scanner.nextInt();
		int maxValue = scanner.nextInt();
		int[][][] pixels = new int[height][width][3];
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				for (int k = 0; k < 3; k++)
				{
					pixels[i][j][k] = scanner.nextInt();
				}
			}
		}
		scanner.close();

		// apply a command
		switch (command)
		{
			case "invert":
				System.out.println("Doing an invert");
				invert(pixels, height, width, maxValue);
				break;
			case "grayscale":
				System.out.println("Doing a greyscale");
				greyscale(pixels, height, width);
				break;
			case "emboss":
				System.out.println("Doing an emboss");
				emboss(pixels, height, width, maxValue);
				break;
			case "motionblur":
				System.out.println("Doing a motionblur");
				int blurIntensity = Integer.parseInt(args[3]);
				motionBlur(pixels, height, width, blurIntensity);
				break;
			default:
				System.out.println("Unrecognized command");
				break;
		}

		// save file
		saveImage(pixels, height, width, maxValue, outFile);
	}

	public static void saveImage(int[][][] pixels, int height, int width, int maxValue, String filePath) throws IOException
	{
		StringBuilder output = new StringBuilder();
		output.append("P3\n");
		output.append(width).append(" ").append(height).append("\n");
		output.append(maxValue).append("\n");

		for (int[][] row : pixels)
		{
			for (int[] column : row)
			{
				output.append(column[0]).append(" ").append(column[1]).append(" ").append(column[2]).append("   ");
			}
			output.append("\n");
		}
		FileWriter outFile = new FileWriter(filePath);
		outFile.write(output.toString());
		outFile.close();
	}

	public static void invert(int[][][] pixels, int height, int width, int maxValue)
	{
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				for (int k = 0; k < 3; k++)
				{
					pixels[i][j][k] -= (pixels[i][j][k] - (maxValue / 2 + 1)) * 2 + 1;
				}
			}
		}
	}

	public static void greyscale(int[][][] pixels, int height, int width)
	{
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				int avg = (pixels[i][j][0] + pixels[i][j][1] + pixels[i][j][2]) / 3;
				pixels[i][j][0] = avg;
				pixels[i][j][1] = avg;
				pixels[i][j][2] = avg;
			}
		}
	}

	public static void emboss(int[][][] pixels, int height, int width, int maxValue)
	{
		int[][][] temp = new int[height][width][3];
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				int redDiff = 0;
				int greenDiff = 0;
				int blueDiff = 0;
				if (i - 1 >= 0 && j - 1 >= 0)
				{
					redDiff = pixels[i][j][0] - pixels[i - 1][j - 1][0];
					greenDiff = pixels[i][j][1] - pixels[i - 1][j - 1][1];
					blueDiff = pixels[i][j][2] - pixels[i - 1][j - 1][2];
				}

				int maxDiff = 0;
				if (Math.abs(redDiff) > Math.abs(maxDiff))
				{
					maxDiff = redDiff;
				}
				if (Math.abs(greenDiff) > Math.abs(maxDiff))
				{
					maxDiff = greenDiff;
				}
				if (Math.abs(blueDiff) > Math.abs(maxDiff))
				{
					maxDiff = blueDiff;
				}
				maxDiff += 128;
				maxDiff = Math.max(0, maxDiff);
				maxDiff = Math.min(maxValue, maxDiff);

				temp[i][j][0] = maxDiff;
				temp[i][j][1] = maxDiff;
				temp[i][j][2] = maxDiff;
			}
		}

		for (int i = 0; i < height; i++)
		{
			pixels[i] = Arrays.stream(temp[i]).map(int[]::clone).toArray(int[][]::new);
		}
	}

	public static void motionBlur(int[][][] pixels, int height, int width, int blurAmt)
	{
		int[][][] temp = new int[height][width][3];
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				int highIndex = Math.min(width, j + blurAmt);
				int redAvg = 0;
				int greenAvg = 0;
				int blueAvg = 0;
				for (int k = j; k < highIndex; k++)
				{
					redAvg += pixels[i][k][0];
					greenAvg += pixels[i][k][1];
					blueAvg += pixels[i][k][2];
				}

				redAvg /= highIndex - j;
				greenAvg /= highIndex - j;
				blueAvg /= highIndex - j;

				temp[i][j][0] = redAvg;
				temp[i][j][1] = greenAvg;
				temp[i][j][2] = blueAvg;
			}
		}

		for (int i = 0; i < height; i++)
		{
			pixels[i] = Arrays.stream(temp[i]).map(int[]::clone).toArray(int[][]::new);
		}
	}
}
