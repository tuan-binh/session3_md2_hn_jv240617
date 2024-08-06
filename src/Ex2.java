import java.util.Arrays;

public class Ex2
{
	public static void main(String[] args)
	{
		// fix cứng mảng
		int[] arr = {1, 2, 4, 5, 6};
		int indexInsert = 2;
		int valueInsert = 3;
		System.out.println("Arr = " + Arrays.toString(arr));
		if (indexInsert > arr.length)
		{
			System.err.println("Vượt quá độ dài mảng");
		}
		else
		{
			int[] newArr = new int[arr.length + 1];
			for (int i = 0; i < newArr.length; i++)
			{
				if (i < indexInsert)
				{
					newArr[i] = arr[i];
				}
				else if (i == indexInsert)
				{
					newArr[i] = valueInsert;
				}
				else
				{
					newArr[i] = arr[i - 1];
				}
			}
			arr = newArr;
			System.out.println("Arr = " + Arrays.toString(arr));
			
		}
	}
}
