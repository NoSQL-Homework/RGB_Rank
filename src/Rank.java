//给定一个字符串里面只有"R" "G" "B" 三个字符，请排序，最终结果的顺序是R在前 G中 B在后。

import java.util.Arrays;

public class Rank {

//    public static String reRank(String[] input){
//
//        int r = 0, g = 0, b = 0;
//        for(String s:input){
//            if(s.equals("r")){
//                r += 1;
//            }else if(s.equals("g")){
//                g += 1;
//            }else if(s.equals("b")){
//                b += 1;
//            }
//        }
//        String output = new String();
//        for(int i = 0; i < r; i++){
//            output += "r";
//        }
//        for(int i = 0; i < g; i++){
//            output += "g";
//        }
//        for (int i = 0; i < b; i++){
//            output += "b";
//        }
//
//        return output;
//    }

    public static String[] reRankTwoPointers(String[] input){
        if(input == null || input.length==0){
            return new String[0];
        }
        int i = 0;//当前位置
        int left = 0;//始
        int right = input.length - 1;//尾
        while (i <= right){
            if(input[i].equals("r")){
                String t1 = input[i];
                input[i] = input[left];
                input[left] = t1;
                i++;
                left++;
            }
            else if(input[i].equals("g")){
                i++;
            }
            else if(input[i].equals("b")){
                String t2 = input[i];
                input[i] = input[right];
                input[right] = t2;
                right--;
            }
        }
        return input;
    }

    public static void main(String[] args){
        String[] input = new String[]{"r","r","b","g","b","r","g"};
        Arrays.asList(reRankTwoPointers(input)).forEach(e->System.out.print(e));
//        System.out.println(reRank(input));
    }
}
