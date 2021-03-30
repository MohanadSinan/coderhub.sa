using System;

namespace A._2_ConcatNames
{
    internal class ConcatNames
    {
        public static string concatNames(string name1, string name2)
        {
            // write your code here
            return name1 + " " + name2;
        }

        private static void Main(string[] args)
        {
            Console.WriteLine("a\tb\t\toutput\n------------------------------------");

            var a = "Be";
            var b = "yourself";
            string R = concatNames(a, b);
            Console.WriteLine(a + "\t" + b + "\t" + R);

            a = "Hello";
            b = "World!";
            R = concatNames(a, b);
            Console.WriteLine(a + "\t" + b + "\t\t" + R);

            a = "Coffee";
            b = "shop";
            R = concatNames(a, b);
            Console.WriteLine(a + "\t" + b + "\t\t" + R);

            a = "Good";
            b = "morning";
            R = concatNames(a, b);
            Console.WriteLine(a + "\t" + b + "\t\t" + R);
        }
    }
}