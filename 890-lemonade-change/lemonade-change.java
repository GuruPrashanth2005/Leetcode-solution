class Solution {
    public boolean lemonadeChange(int[] bills) {
    int n =  bills.length;
    int ten = 0;
    int five = 0;
    for(int i = 0; i < n; i++){
        if(bills[i] == 5){
            five++;
        }
        else if(bills[i] == 10)
        {
            if(five > 0){
                ten++;
                five--;
            }
            else{
                return false;
            }
        }
        else
        {
            if(five > 0 && ten > 0)
            {
                ten--;
                five--;
            }
            else if(five >= 3)
            {
                five -= 3;
            }
            else{
                return false;
            }
        }
    }
    return true;
    }
}