package passoff;

import editor.ImageEditor;
import org.junit.jupiter.api.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ImageEditorTest
{
	private static final String SOURCE_IMAGE_DIRECTORY = "source_images/";
	private static final String OUT_IMAGE_DIRECTORY = "out_images/";
	private static final String KEY_IMAGE_DIRCTORY = "key_images/";
	private static final String FEEP = "feep.ppm";
	private static final String ONE_DOES_NOT = "one-does-not-simply.ppm";
	private static final String PENGUINS = "Penguins.ppm";
	private static final String SUNSET = "sunset.ppm";
	private static final String TINY = "tiny.ppm";
	private static final String INVERT = "invert";
	private static final String GRAYSCALE = "grayscale";
	private static final String EMBOSS = "emboss";
	private static final String MOTION = "motionblur";


	@Test
	@DisplayName("Test Invert Tiny")
	void invertTinyTest()
	{
		System.out.println("Invert Tiny");
		String[] command = {SOURCE_IMAGE_DIRECTORY + TINY, OUT_IMAGE_DIRECTORY + "invert-" + TINY, INVERT};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "invert-" + TINY, KEY_IMAGE_DIRCTORY + "invert-" + TINY);
	}

	@Test
	@DisplayName("Test Invert Invert Feep")
	void invertFeepTest()
	{
		System.out.println("Invert Invert Feep");
		String[] command = {SOURCE_IMAGE_DIRECTORY + FEEP, OUT_IMAGE_DIRECTORY + "invert-" + FEEP, INVERT};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "invert-" + FEEP, KEY_IMAGE_DIRCTORY + "invert-" + FEEP);
	}

	@Test
	@DisplayName("Test Invert Meme")
	void invertMemeTest()
	{
		System.out.println("Invert Meme");
		String[] command = {SOURCE_IMAGE_DIRECTORY + ONE_DOES_NOT, OUT_IMAGE_DIRECTORY + "invert-" + ONE_DOES_NOT, INVERT};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "invert-" + ONE_DOES_NOT, KEY_IMAGE_DIRCTORY + "invert-" + ONE_DOES_NOT);
	}

	@Test
	@DisplayName("Test Invert Sunset")
	void invertSunsetTest()
	{
		System.out.println("Invert Sunset");
		String[] command = {SOURCE_IMAGE_DIRECTORY + SUNSET, OUT_IMAGE_DIRECTORY + "invert-" + SUNSET, INVERT};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "invert-" + SUNSET, KEY_IMAGE_DIRCTORY + "invert-" + SUNSET);
	}

	@Test
	@DisplayName("Test Invert Penguins")
	void invertPenguinsTest()
	{
		System.out.println("Invert Penguins");
		String[] command = {SOURCE_IMAGE_DIRECTORY + PENGUINS, OUT_IMAGE_DIRECTORY + "invert-" + PENGUINS, INVERT};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "invert-" + PENGUINS, KEY_IMAGE_DIRCTORY + "invert-" + PENGUINS);
	}

	@Test
	@DisplayName("Test Grayscale Tiny")
	void grayscaleTinyTest()
	{
		System.out.println("Grayscale Tiny");
		String[] command = {SOURCE_IMAGE_DIRECTORY + TINY, OUT_IMAGE_DIRECTORY + "grayscale-" + TINY, GRAYSCALE};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "grayscale-" + TINY, KEY_IMAGE_DIRCTORY + "grayscale-" + TINY);
	}

	@Test
	@DisplayName("Test Grayscale Feep")
	void grayscaleFeepTest()
	{
		System.out.println("Grayscale Feep");
		String[] command = {SOURCE_IMAGE_DIRECTORY + FEEP, OUT_IMAGE_DIRECTORY + "grayscale-" + FEEP, GRAYSCALE};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "grayscale-" + FEEP, KEY_IMAGE_DIRCTORY + "grayscale-" + FEEP);
	}

	@Test
	@DisplayName("Test Grayscale Meme")
	void grayscaleMemeTest()
	{
		System.out.println("Grayscale Meme");
		String[] command = {SOURCE_IMAGE_DIRECTORY + ONE_DOES_NOT, OUT_IMAGE_DIRECTORY + "grayscale-" + ONE_DOES_NOT, GRAYSCALE};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "grayscale-" + ONE_DOES_NOT, KEY_IMAGE_DIRCTORY + "grayscale-" + ONE_DOES_NOT);
	}

	@Test
	@DisplayName("Test Grayscale Sunset")
	void grayscaleSunsetTest()
	{
		System.out.println("Grayscale Sunset");
		String[] command = {SOURCE_IMAGE_DIRECTORY + SUNSET, OUT_IMAGE_DIRECTORY + "grayscale-" + SUNSET, GRAYSCALE};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "grayscale-" + SUNSET, KEY_IMAGE_DIRCTORY + "grayscale-" + SUNSET);
	}

	@Test
	@DisplayName("Test Grayscale Penguins")
	void grayscalePenguinsTest()
	{
		System.out.println("Grayscale Penguins");
		String[] command = {SOURCE_IMAGE_DIRECTORY + PENGUINS, OUT_IMAGE_DIRECTORY + "grayscale-" + PENGUINS, GRAYSCALE};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "grayscale-" + PENGUINS, KEY_IMAGE_DIRCTORY + "grayscale-" + PENGUINS);
	}

	@Test
	@DisplayName("Test Emboss Tiny")
	void embossTinyTest()
	{
		System.out.println("Emboss Tiny");
		String[] command = {SOURCE_IMAGE_DIRECTORY + TINY, OUT_IMAGE_DIRECTORY + "emboss-" + TINY, EMBOSS};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "emboss-" + TINY, KEY_IMAGE_DIRCTORY + "emboss-" + TINY);
	}

	@Test
	@DisplayName("Test Emboss Feep")
	void embossFeepTest()
	{
		System.out.println("Emboss Feep");
		String[] command = {SOURCE_IMAGE_DIRECTORY + FEEP, OUT_IMAGE_DIRECTORY + "emboss-" + FEEP, EMBOSS};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "emboss-" + FEEP, KEY_IMAGE_DIRCTORY + "emboss-" + FEEP);
	}

	@Test
	@DisplayName("Test Emboss Meme")
	void embossMemeTest()
	{
		System.out.println("Emboss Meme");
		String[] command = {SOURCE_IMAGE_DIRECTORY + ONE_DOES_NOT, OUT_IMAGE_DIRECTORY + "emboss-" + ONE_DOES_NOT, EMBOSS};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "emboss-" + ONE_DOES_NOT, KEY_IMAGE_DIRCTORY + "emboss-" + ONE_DOES_NOT);
	}

	@Test
	@DisplayName("Test Emboss Sunset")
	void embossSunsetTest()
	{
		System.out.println("Emboss Sunset");
		String[] command = {SOURCE_IMAGE_DIRECTORY + SUNSET, OUT_IMAGE_DIRECTORY + "emboss-" + SUNSET, EMBOSS};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "emboss-" + SUNSET, KEY_IMAGE_DIRCTORY + "emboss-" + SUNSET);
	}

	@Test
	@DisplayName("Test Emboss Penguins")
	void embossPenguinsTest()
	{
		System.out.println("Emboss Penguins");
		String[] command = {SOURCE_IMAGE_DIRECTORY + PENGUINS, OUT_IMAGE_DIRECTORY + "emboss-" + PENGUINS, EMBOSS};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "emboss-" + PENGUINS, KEY_IMAGE_DIRCTORY + "emboss-" + PENGUINS);
	}

	@Test
	@DisplayName("Test Motion 1 Tiny")
	void motion1TinyTest()
	{
		System.out.println("Motion 1 Tiny");
		String[] command = {SOURCE_IMAGE_DIRECTORY + TINY, OUT_IMAGE_DIRECTORY + "motionblur-1-" + TINY, MOTION, "1"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-1-" + TINY, KEY_IMAGE_DIRCTORY + "motionblur-1-" + TINY);
	}

	@Test
	@DisplayName("Test Motion 1 Feep")
	void motion1FeepTest()
	{
		System.out.println("Motion 1 Feep");
		String[] command = {SOURCE_IMAGE_DIRECTORY + FEEP, OUT_IMAGE_DIRECTORY + "motionblur-1-" + FEEP, MOTION, "1"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-1-" + FEEP, KEY_IMAGE_DIRCTORY + "motionblur-1-" + FEEP);
	}

	@Test
	@DisplayName("Test Motion 1 Meme")
	void motion1MemeTest()
	{
		System.out.println("Motion 1 Meme");
		String[] command = {SOURCE_IMAGE_DIRECTORY + ONE_DOES_NOT, OUT_IMAGE_DIRECTORY + "motionblur-1-" + ONE_DOES_NOT, MOTION, "1"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-1-" + ONE_DOES_NOT, KEY_IMAGE_DIRCTORY + "motionblur-1-" + ONE_DOES_NOT);
	}

	@Test
	@DisplayName("Test Motion 1 Sunset")
	void motion1SunsetTest()
	{
		System.out.println("Motion 1 Sunset");
		String[] command = {SOURCE_IMAGE_DIRECTORY + SUNSET, OUT_IMAGE_DIRECTORY + "motionblur-1-" + SUNSET, MOTION, "1"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-1-" + SUNSET, KEY_IMAGE_DIRCTORY + "motionblur-1-" + SUNSET);
	}

	@Test
	@DisplayName("Test Motion 1 Penguins")
	void motion1PenguinsTest()
	{
		System.out.println("Motion 1 Penguins");
		String[] command = {SOURCE_IMAGE_DIRECTORY + PENGUINS, OUT_IMAGE_DIRECTORY + "motionblur-1-" + PENGUINS, MOTION, "1"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-1-" + PENGUINS, KEY_IMAGE_DIRCTORY + "motionblur-1-" + PENGUINS);
	}

	@Test
	@DisplayName("Test Motion 5 Tiny")
	void motion5TinyTest()
	{
		System.out.println("Motion 5 Tiny");
		String[] command = {SOURCE_IMAGE_DIRECTORY + TINY, OUT_IMAGE_DIRECTORY + "motionblur-5-" + TINY, MOTION, "5"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-5-" + TINY, KEY_IMAGE_DIRCTORY + "motionblur-5-" + TINY);
	}

	@Test
	@DisplayName("Test Motion 5 Feep")
	void motion5FeepTest()
	{
		System.out.println("Motion 5 Feep");
		String[] command = {SOURCE_IMAGE_DIRECTORY + FEEP, OUT_IMAGE_DIRECTORY + "motionblur-5-" + FEEP, MOTION, "5"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-5-" + FEEP, KEY_IMAGE_DIRCTORY + "motionblur-5-" + FEEP);
	}

	@Test
	@DisplayName("Test Motion 5 Meme")
	void motion5MemeTest()
	{
		System.out.println("Motion 5 Meme");
		String[] command = {SOURCE_IMAGE_DIRECTORY + ONE_DOES_NOT, OUT_IMAGE_DIRECTORY + "motionblur-5-" + ONE_DOES_NOT, MOTION, "5"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-5-" + ONE_DOES_NOT, KEY_IMAGE_DIRCTORY + "motionblur-5-" + ONE_DOES_NOT);
	}

	@Test
	@DisplayName("Test Motion 5 Sunset")
	void motion5SunsetTest()
	{
		System.out.println("Motion 5 Sunset");
		String[] command = {SOURCE_IMAGE_DIRECTORY + SUNSET, OUT_IMAGE_DIRECTORY + "motionblur-5-" + SUNSET, MOTION, "5"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-5-" + SUNSET, KEY_IMAGE_DIRCTORY + "motionblur-5-" + SUNSET);
	}

	@Test
	@DisplayName("Test Motion 5 Penguins")
	void motion5PenguinsTest()
	{
		System.out.println("Motion 5 Penguins");
		String[] command = {SOURCE_IMAGE_DIRECTORY + PENGUINS, OUT_IMAGE_DIRECTORY + "motionblur-5-" + PENGUINS, MOTION, "5"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-5-" + PENGUINS, KEY_IMAGE_DIRCTORY + "motionblur-5-" + PENGUINS);
	}

	@Test
	@DisplayName("Test Motion 20 Tiny")
	void motion20TinyTest()
	{
		System.out.println("Motion 20 Tiny");
		String[] command = {SOURCE_IMAGE_DIRECTORY + TINY, OUT_IMAGE_DIRECTORY + "motionblur-20-" + TINY, MOTION, "20"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-20-" + TINY, KEY_IMAGE_DIRCTORY + "motionblur-20-" + TINY);
	}

	@Test
	@DisplayName("Test Motion 20 Feep")
	void motion20FeepTest()
	{
		System.out.println("Motion 20 Feep");
		String[] command = {SOURCE_IMAGE_DIRECTORY + FEEP, OUT_IMAGE_DIRECTORY + "motionblur-20-" + FEEP, MOTION, "20"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-20-" + FEEP, KEY_IMAGE_DIRCTORY + "motionblur-20-" + FEEP);
	}

	@Test
	@DisplayName("Test Motion 20 Meme")
	void motion20MemeTest()
	{
		System.out.println("Motion 20 Meme");
		String[] command = {SOURCE_IMAGE_DIRECTORY + ONE_DOES_NOT, OUT_IMAGE_DIRECTORY + "motionblur-20-" + ONE_DOES_NOT, MOTION, "20"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-20-" + ONE_DOES_NOT, KEY_IMAGE_DIRCTORY + "motionblur-20-" + ONE_DOES_NOT);
	}

	@Test
	@DisplayName("Test Motion 20 Sunset")
	void motion20SunsetTest()
	{
		System.out.println("Motion 20 Sunset");
		String[] command = {SOURCE_IMAGE_DIRECTORY + SUNSET, OUT_IMAGE_DIRECTORY + "motionblur-20-" + SUNSET, MOTION, "20"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-20-" + SUNSET, KEY_IMAGE_DIRCTORY + "motionblur-20-" + SUNSET);
	}

	@Test
	@DisplayName("Test Motion 20 Penguins")
	void motion20PenguinsTest()
	{
		System.out.println("Motion 20 Penguins");
		String[] command = {SOURCE_IMAGE_DIRECTORY + PENGUINS, OUT_IMAGE_DIRECTORY + "motionblur-20-" + PENGUINS, MOTION, "20"};
		try
		{
			ImageEditor.main(command);
		} catch (Throwable t)
		{
			fail("Running main threw: " + t.getClass());
		}
		compareFiles(OUT_IMAGE_DIRECTORY + "motionblur-20-" + PENGUINS, KEY_IMAGE_DIRCTORY + "motionblur-20-" + PENGUINS);
	}

	private void compareFiles(String studentPath, String keyPath)
	{
		String next = "";
		boolean hasNext;
		File keyFile = new File(keyPath);
		assertTrue(keyFile.exists(), "Key File not found. Check driver structure.");
		File studentFile = new File(studentPath);
		assertTrue(studentFile.exists(), "Student File (" + studentPath + ") not found.");
		assertTrue(studentFile.canRead(), "Student File (" + studentPath + ") not readable.");
		assertNotEquals(0, studentFile.length(), "Student File (" + studentPath + ") is empty.");
		Scanner studentScanner = null;
		try
		{
			studentScanner = new Scanner(studentFile).useDelimiter("((#[^\\n]*\\n)|(\\s+))+");
		} catch (FileNotFoundException e)
		{
			fail("Student File Failed to open. Check that student writes file to exactly the input value.");
		}
		Scanner keyScanner = null;
		try
		{
			keyScanner = new Scanner(keyFile).useDelimiter("((#[^\\n]*\\n)|(\\s+))+");
		} catch (FileNotFoundException e)
		{
			fail("Key File Failed to open. This shouldn't happen.");
		}

		//compare header
		String p3 = studentScanner.next();
		assertEquals("P3", p3, "Student File (" + studentPath + ") does not start with \'P3\'.");
		keyScanner.next();

		hasNext = studentScanner.hasNext();
		if (hasNext) next = studentScanner.next();
		assertTrue(studentScanner.hasNextInt(), "Expected width where student file has " +
				(hasNext ? next : "EOF"));
		int width = Integer.parseInt(next);
		int realWidth = keyScanner.nextInt();

		hasNext = studentScanner.hasNext();
		if (hasNext) next = studentScanner.next();
		assertTrue(studentScanner.hasNextInt(), "Expected height where student file has " +
				(hasNext ? next : "EOF"));
		int height = Integer.parseInt(next);
		int realHeight = keyScanner.nextInt();

		assertEquals(realWidth, width, "Incorrect width." +
				(width == realHeight ? " Student mixed width and height." : ""));
		assertEquals(realHeight, height, "Incorrect height." +
				(realWidth == height ? " Student mixed width and height." : ""));

		hasNext = studentScanner.hasNext();
		if (hasNext) next = studentScanner.next();
		assertTrue(studentScanner.hasNextInt(), "Expected max color where student file has " +
				(hasNext ? next : "EOF"));
		int maxColor = Integer.parseInt(next);
		int realMaxColor = keyScanner.nextInt();
		assertEquals(realMaxColor, maxColor, "Incorrect max color.");

		int red, green, blue, realRed, realGreen, realBlue;
		int pixelNum = 0;
		while (keyScanner.hasNextInt())
		{
			boolean hasNextInt = studentScanner.hasNextInt();
			hasNext = studentScanner.hasNext();
			if (hasNext) next = studentScanner.next();
			assertTrue(hasNextInt, "Expected red value at " +
					getCoordinate(pixelNum, width) +
					" where student file has " +
					(hasNext ? next : "EOF"));
			red = Integer.parseInt(next);
			realRed = keyScanner.nextInt();

			hasNextInt = studentScanner.hasNextInt();
			hasNext = studentScanner.hasNext();
			if (hasNext) next = studentScanner.next();
			assertTrue(hasNextInt, "Expected green value at " +
					getCoordinate(pixelNum, width) +
					" where student file has " +
					(hasNext ? next : "EOF"));
			green = Integer.parseInt(next);
			realGreen = keyScanner.nextInt();

			hasNextInt = studentScanner.hasNextInt();
			hasNext = studentScanner.hasNext();
			if (hasNext) next = studentScanner.next();
			assertTrue(hasNextInt, "Expected blue value at " +
					getCoordinate(pixelNum, width) +
					" where student file has " +
					(hasNext ? next : "EOF"));
			blue = Integer.parseInt(next);
			realBlue = keyScanner.nextInt();
			Pixel studentPixel = new Pixel(red, green, blue);
			Pixel realPixel = new Pixel(realRed, realGreen, realBlue);
			assertEquals(realPixel.toString(), studentPixel.toString(), createErrorMessage(pixelNum, width, height));

			pixelNum++;
		}

		assertFalse(studentScanner.hasNext(), "Expected EOF at " +
				getCoordinate(pixelNum, width) +
				" where student file continues.");
	}

	private String getCoordinate(int elementNum, int width)
	{
		int x = elementNum % width;
		int y = elementNum / width;
//		StringBuilder sb = new StringBuilder();
//		sb.append("(x:");
//		sb.append(x);
//		sb.append(", y:");
//		sb.append(y);
//		sb.append(")");
//		return sb.toString();
		return "(x:" + x + ", y:" + y + ")";
	}

	private String createErrorMessage(int elementNum, int width, int height)
	{
		int x = elementNum % width;
		int y = elementNum / width;
		StringBuilder sb = new StringBuilder();
		sb.append("Incorrect pixel value(s) at (x:");
		sb.append(x);
		sb.append(", y:");
		sb.append(y);
		sb.append(")");
		//checking for edge or corner case
		StringBuilder extra = new StringBuilder();
		if (y == 0)
		{
			extra.append("top");
		} else if (y == height - 1)
		{
			extra.append("bottom");
		}
		if (x == 0)
		{
			if (extra.length() > 0) extra.append("-left corner");
			else extra.append("left");
		} else if (x == width - 1)
		{
			if (extra.length() > 0) extra.append("-right corner");
			else extra.append("right");
		}
		if (!extra.toString().contains("corner") && (extra.length() > 1)) extra.append(" edge");

		if (extra.length() > 0)
		{
			sb.append(" at ");
			sb.append(extra);
		}
		return sb.toString();
	}
}