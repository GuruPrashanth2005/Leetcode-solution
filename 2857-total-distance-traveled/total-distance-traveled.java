class Solution {
    public int distanceTraveled(int main, int additional) {
        int mul = 0;
        while(main >=5)
        {
            if(additional == 0)
            {
                break;
            }
            mul += 50;
            main -= 4;
            additional--;
        }
        return mul+(main*10);
    }
}