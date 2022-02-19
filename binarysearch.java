
public class binarysearch
{
    public static void main(String[] args) {

  int[]a= {1,2,3,4,76, 78};
  //n = a.length;
   int num = 7;
   int ans = binarySearch(a , num);
        System.out.println(ans);
    }

  static int binarySearch(int[]a , int num) {

      int beg = 0;
      int end = a.length - 1;

      while (beg <= end) {
          int mid = beg + (end - beg) / 2;
          if (a[mid] == num) {
            return mid;
          } else if (num < a[mid]) {
              end = mid - 1;

          } else //if (num > a[mid]) {
              beg = mid + 1;
          }
      return -1;
      }

  }
