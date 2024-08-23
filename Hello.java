import java.util.Scanner;
	class Hello{
		public static void main(String[] args)
		{
		Scanner read = new Scanner(System.in);
		System.out.println ("Hola ingresa tu nombre");
		String name = read.next();
		System.out.println (name+" ingresa tu an_o de nacimiento");
		int a = read.nextInt();
		System.out.println (name+" ingresa tu dia de nacimiento en numeros");
		int d = read.nextInt();
		System.out.println (name+" ingresa tu mes de nacimiento en numeros");
		int m = read.nextInt();
		int r = 2024-a;
		if(m>8)
			{
			if(d>23)
			{
			r = r-1;
			}
			
			}
		if(m==1)
			{
			
				if(d<20)
					{
					System.out.println (name+" tu signo zodiacal es Capricornio y tienes "+r+ " an_o");
					}
				else
					{
					System.out.println (name+" tu signo zodiacal es Acuario y tienes "+r+ " an_o");
					}
			}
		if(m==2)
			{
				if(d<19)
				{
				System.out.println (name+" tu signo zodiacal es Acuario y tienes "+r+ " an_o");
				}
			else
				{
				System.out.println (name+" tu signo zodiacal es Piscis y tienes "+r+ " an_o");
				}
			}
		
		if(m==3)
			{
			if(d<21)
				{
				System.out.println (name+" tu signo zodiacal es Piscis y tienes "+r+ " an_o");
				}
			else
				{
				System.out.println (name+" tu signo zodiacal es Aries y tienes "+r+ " an_o");
				}
			}
		if(m==4)
			{
			if(d<20)
				{
				System.out.println (name+" tu signo zodiacal es aries y tienes "+r+ " an_o");
				}
			else
				{
				System.out.println (name+" tu signo zodiacal es Tauro y tienes "+r+ " an_o");
				}
			}
		if(m==5)
			{
			if(d<21)
				{
				System.out.println (name+" tu signo zodiacal es Tauro y tienes "+r+ " an_o");
				}
			else
				{
				System.out.println (name+" tu signo zodiacal es Geminis y tienes "+r+ " an_o");
				}
			}
		if(m==6)
			{
			if(d<21)
				{
				System.out.println (name+" tu signo zodiacal es Geminis y tienes "+r+ " an_o");
				}
			else
				{
				System.out.println (name+" tu signo zodiacal es Cancer y tienes "+r+ " an_o");
				}
			}
		if(m==7)
			{
			if(d<23)
				{
				System.out.println (name+" tu signo zodiacal es Cancer y tienes "+r+ " an_o");
				}
			else
				{
				System.out.println (name+" tu signo zodiacal es Leo y tienes "+r+ " an_o");
				}
			}
		if(m==8)
			{
			if(d<23)
				{
				System.out.println (name+" tu signo zodiacal es Leo y tienes "+r+ " an_o");
				}
			else
				{
				System.out.println (name+" tu signo zodiacal es Virgo y tienes "+r+ " an_o");
				}
			}
		if(m==9)
			{
			if(d<23)
				{
				System.out.println (name+" tu signo zodiacal es Virgo y tienes "+r+ " an_o");
				}
			else
				{
				System.out.println (name+" tu signo zodiacal es Libra y tienes "+r+ " an_o");
				}
		if(m==10)
			{
			if(d<23)
				{
				System.out.println (name+" tu signo zodiacal es Libra y tienes "+r+ " an_o");
				}
			else
				{
				System.out.println (name+" tu signo zodiacal es Escorpio y tienes "+r+ " an_o");
				}
			}			}
		if(m==11)
			{
			if(d<22)
				{
				System.out.println (name+" tu signo zodiacal es Escorpio y tienes "+r+ " an_o");
				}
			else
				{
				System.out.println (name+" tu signo zodiacal es Sagitario y tienes "+r+ " an_o");
				}
			}
		if(m==12)
			{
			if(d<22)
				{
				System.out.println (name+" tu signo zodiacal es Sagitario y tienes "+r+ " an_o");
				}
			else
				{
				System.out.println (name+" tu signo zodiacal es Capricornio y tienes "+r+ " an_o");
				}
			}

		
}
}