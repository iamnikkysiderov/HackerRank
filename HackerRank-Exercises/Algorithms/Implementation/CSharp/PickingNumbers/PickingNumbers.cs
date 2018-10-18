using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PickingNumbers // unsolved - 4/10
{
    class PickingNumbers
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            List<int> arr = Console.ReadLine().Split(' ').Select(int.Parse).ToList();
            int counter = 0;
            List<int> counters = new List<int>();

            for (int i = 0; i < arr.Count; i++)
            {
                for (int j = 0; j < arr.Count; j++)
                {
                    if (i == j)
                    {
                        continue;
                    }

                    if (Math.Abs(arr[i] - arr[j]) == 0 || Math.Abs(arr[i] - arr[j]) == 1)
                    {
                        counter++;
                    }
                }

                counters.Add(counter);

                counter = 0;
            }

            Console.WriteLine(counters.Max());
        }
    }
}
