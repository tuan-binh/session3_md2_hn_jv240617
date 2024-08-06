import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		
		/**
		 * Nhập vào số lượng phần tử của mảng
		 * Nhập vào vào 1 mảng
		 * */
		Scanner sc = new Scanner(System.in);
		// 1. nhập vào số lượng của mảng
		System.out.println("Nhập vào số lượng phần tử của mảng");
		int size = Integer.parseInt(sc.nextLine());
		int[] arr = new int[size];
		// 2. nhập vào các phần tử của mảng
		for (int i = 0; i < size; i++)
		{
			System.out.println("Nhập vào phần tử thứ " + (i + 1) + " : ");
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Arr = " + Arrays.toString(arr));
		// 3. thực hiện nhập vào số muốn xóa:
		int numberDelete = Integer.parseInt(sc.nextLine());
		int indexDelete = -1;
		for (int i = 0; i < size; i++)
		{
			if (arr[i] == numberDelete)
			{
				indexDelete = i;
				break;
			}
		}
		if (indexDelete != -1)
		{
			int[] newArr = new int[size - 1];
			for (int i = 0; i < newArr.length; i++)
			{
				if (i < indexDelete)
				{
					newArr[i] = arr[i];
				}
				else
				{
					newArr[i] = arr[i + 1];
				}
			}
			arr = newArr;
			System.out.println("New Arr = " + Arrays.toString(arr));
		}
		else
		{
			System.err.println("Không tồn tại số " + numberDelete + " trong mảng");
		}
	}
}