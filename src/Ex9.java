public class Ex9
{
	public static void main(String[] args)
	{
		int[][] myArr = new int[3][3];
//		[ [1,2,3], [1,2,3],[1,2,3] ] ->
		int[] arr = {6, 7, 7};
		int max1 = arr[0];
		int max2 = arr[0];
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > max1)
			{
				max2 = max1;
				max1 = arr[i];
			}
		}
		if (max2 == max1)
		{
			System.out.println("Max 1 = " + max1);
			System.out.println("Không có số lớn thứ 2");
		}
		else
		{
			System.out.println("Max 1 = " + max1);
			System.out.println("Max 2 = " + max2);
		}
		/**
		 *                         *
		 *                     *       *
		 *                 *               *
		 *             *                       *
		 *         *   *   *   *   *   *   *   *   *
		 * */
	}
}
