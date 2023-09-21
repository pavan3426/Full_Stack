function amountTocoins(amount,arr) {
    var num = amount;
    var str = '';
    for (var i=0; i<arr.length; i++) {
      if (num>=arr[i]) {
        num = num - arr[i];
        str = str + arr[i] + ',';
        i--;
      }
    }
    console.log(str);
  }
  
  var arr=[25, 10, 5, 2, 1];
  amountTocoins(46,arr)