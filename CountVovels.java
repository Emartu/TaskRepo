/*System.out.println("Commited in dev branch 1")
System.out.println("Commited in dev branch 2")*/
public class CountVovels {
    public static void main(String[] args) {
        String[] arr = new String[]{"Minskaaaaaas", "Akapulkooo", "Warsawa"};
System.out.println("commited in master #6 before rebase")
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (count(arr[j]) <count(arr[i])) {
                    String min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Strings are sorteted by vovels number" + arr[i]);
        }
    }
    public static int count(String S) {
        int vowelCount = 0;
        for (int j = 0; j < S.length(); j++) {
            switch (S.charAt(j)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
                default:
            }
        }
        return vowelCount;
    }
<<<<<<< dd32b7db93fd0baf38d6b4d48df9bac9d3a4e5fe

=======
	 
>>>>>>> Commit in master #6 before rebase
}
//First change
//Second Local Change
//Third change
//Second local DEV change
