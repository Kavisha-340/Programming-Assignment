function isVowelPresent(str) {
    const lowerCaseStr = str.toLowerCase();
    const vowels = ['a', 'e', 'i', 'o', 'u'];

    for (let i = 0; i < lowerCaseStr.length; i++) {
      if (vowels.includes(lowerCaseStr[i])) {
        return true; 
      }
    }
  
    return false;
  }
  
  const inputString = "Kavisha Gupta";
  const result = isVowelPresent(inputString);
  
  if (result) {
    console.log("The string contains at least one vowel.");
  } else {
    console.log("The string does not contain any vowels.");
  }
  