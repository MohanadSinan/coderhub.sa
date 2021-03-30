using System;

namespace A._1_Sub
{
    internal class Sub
    {
        public static long sub(int a, int b)
        {
            // write your code here
            return a - b;
        }

        private static void Main(string[] args)
        {
            Console.WriteLine("a\t-\tb\t=\toutput\n---------------------------------------");

            var a = 10;
            var b = 5;
            long R1 = sub(a, b);
            Console.WriteLine(a + "\t-\t" + b + "\t=\t  " + R1);

            a = 3;
            b = -3;
            long R2 = sub(a, b);
            Console.WriteLine(a + "\t-\t" + b + "\t=\t  " + R2);

            a = -4;
            b = 1;
            long R3 = sub(a, b);
            Console.WriteLine(a + "\t-\t" + b + "\t=\t  " + R3);

            a = 0;
            b = -1;
            long R4 = sub(a, b);
            Console.WriteLine(a + "\t-\t" + b + "\t=\t  " + R4);

            a = 0;
            b = 0;
            long R5 = sub(a, b);
            Console.WriteLine(a + "\t-\t" + b + "\t=\t  " + R5);

            a = -96;
            b = -4;
            long R6 = sub(a, b);
            Console.WriteLine(a + "\t-\t" + b + "\t=\t  " + R6);
        }
    }
}