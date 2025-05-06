
public class Main {
    public static void main(String[] args) {

//        String input = "malayalam";
//        int left = 0, right = input.length() - 1, flag = 0;
//        while(left < right) {
//            if (input.charAt(left) != input.charAt(right)) {
//                flag = -1;
//                break;
//            }
//            left++;
//            right--;
//        }
//        if(flag == 0)
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not a Palindrome");


        String s1 = "abcd";
        int s1Length = s1.length();
        String s2 = "def";
        System.out.println("Before Swap: s1: = " + s1 + "  s2: = " +s2);
        s1 = s1.concat(s2);
        int newLen = s1.length();
        s2 = s1.substring(0 , s1Length);
        s1 = s1.substring(s1Length, newLen);
        System.out.println("After Swap: s1: = " + s1 + "  s2: = " +s2);


        String text= null;

        if(null==text){
            System.out.println("A");
        }
        if(text.equals("null")){
            System.out.println("B");
        }

//select * from employee order by createdTimestamp desc limit= 10
        // select emp.empName, dept.DeptName from Employee emp left join Department dept on
        // emp.deptId = dept.id


    }
}
