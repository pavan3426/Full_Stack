
function one(sum){
    var sum1=0;
    while(sum>0){
        r=sum/10;
        sum1=sum1+r;
        sum=sum%10;
    }

    if(sum1==1){
        console.log(sum + "is happy number");
    }
    else{
              Happy(sum);
    }
}

  function Happy(i){
   
        var sum=0;
        while(i>0){
            var r=i/10;
           sum=Math.pow(r,2)+sum;
           i=i%10;
        }
        one(sum)
        
      
    }
 for(var i=20;i<26;i++){
    Happy(i);
 }
    



  