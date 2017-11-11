package algorithm;

/**
 * We have two special characters. The first character can be represented by one bit 0.
 * The second character can be represented by two bits (10 or 11).
 * Now given a string represented by several bits.
 * Return whether the last character must be a one-bit character or not.
 * The given string will always end with a zero.
 */
public class CharactersOneOrTwo020 {
    public boolean isOneBitCharacter(int[] bits){
        int bit = bits[0];
        int t = bits.length;
        int i=0;
        while (i<t){
            if(bit == 1){
                i=i+2;
            }else{
                i=i+1;
            }
            if (i>= t) break;
            bit = bits[i];
        }

        return bit == 0;
    }
    public boolean isOneBitCharacter_01(int[] bits){
        int i =0;
        while (i<bits.length){
            i = i+bits[i]+1;
        }
        return i == bits.length-1;
    }
    //Greedy
    public boolean isOneBitCharacter_greed(int[] bits){
        int i = bits.length-2;
        while (i>=0&&bits[i]>0) i--;
        return (bits.length-i)%2 ==0;
    }
}
