let count =0 ;

const interval = setInterval(function() {
    count++;
    console.log('one second completed');
    if(count==5){
        console.log('Five seconds completed Final Message:- Thankyou Visit Again');
        clearInterval(interval);
    }
},1000);

// setTimeout(function(){
//     console.log('Five seconds completed Final Message:- Thankyou Visit Again');
// },6000);
// setTimeout.close()