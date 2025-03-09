

class CapitalSmall{

	static void check (char ch)
	{
		if (Character.isUpperCase(ch))
			System.out.println(ch + " is an upperCase character");
		else if (Character.isLowerCase(ch))
			System.out.println(ch + " is a lowerCase character");
		else
			System.out.println(ch + " is not an alphabetic character");
	}

	public static void main(String[] args)
	{
		char ch;
		ch = 'A';
		check(ch);
		ch = 'a';

		check(ch);

		ch = '0';

		check(ch);
	}
}
