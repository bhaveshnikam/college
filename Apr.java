boolean wifiRange(int N, String S, int X) 
    { 
        // code here
        int zero=0,one=0;
        for(int i=0;i<N;i++){
            if(S.charAt(i)=='1'){
                if(zero!=0){
                    if(one==0 && zero>X)return false;
                    else if(zero>X*2)return false;
                }
                one=1;
                zero=0;
            }
            else zero++;
        }
        if(zero!=0){
            if(one==0 || (zero>X))return false;
        }
        return
