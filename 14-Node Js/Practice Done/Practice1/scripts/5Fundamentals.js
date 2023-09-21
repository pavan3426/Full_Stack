function transformString(str) {
    if (str.length < 3) {
      return str.toUpperCase();
    } else {
      const firstThreeChars = str.substring(0, 3).toLowerCase();
      const remainingChars = str.substring(3);
      return firstThreeChars + remainingChars;
    }
  }
  
  const givenString = 'USING JAVA SCRIPT';
  console.log(`old String: ${givenString}`);
  console.log(`New string: `+ transformString(givenString));
  