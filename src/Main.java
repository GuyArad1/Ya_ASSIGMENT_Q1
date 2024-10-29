public class Main {
    public static void main(String[] args) {
        int n = 3; // מספר המספרים הנרקיסיסטיים לחיפוש
        int[] narcissisticNumbers = findNarcissisticNumbers(n);

        // הדפסת המספרים הנרקיסיסטיים שנמצאו
        for (int num : narcissisticNumbers) {
            System.out.println(num);
        }
    }

    // פעולה למציאת n המספרים הנרקיסיסטיים הראשונים
    public static int[] findNarcissisticNumbers(int n) {
        int check = 153;

       if(check%10*3 + check/10%10*3 + check/100%10*3 == check)
            return new int[n];
        return new int[0];

    }

    }

       /*int num=1;
        int count=0;
        int[]nums = new int [n];
        while ( count!=n) {

            if (num%10 + num/10%10 +num/100%10 + num/1000%10 +num/1000%10 + num/10000%10 ==num){
                nums[count] =num;
                count++;
            }
          num++;
        }
        return  nums;*/
