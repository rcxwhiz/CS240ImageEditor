package passoff;


public class Pixel
{
	private int red;
	private int green;
	private int blue;

	public Pixel(int red, int green, int blue)
	{
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Pixel pixel = (Pixel) o;
		return red == pixel.red &&
				green == pixel.green &&
				blue == pixel.blue;
	}

	@Override
	public String toString()
	{
		return "(" +
				"r=" + red +
				", g=" + green +
				", b=" + blue +
				')';
	}
}
