function reverse(sentence) {
    const words = sentence.split(' ');
    const reversed = words.map(word => {
      return word.split('').reverse().join('');
    });

    const reversedSentence = reversed.join(' ');
  
    return reversedSentence;
  }
  
  // Example usage:
  const input1 = "This is a sunny day";
  const reversedSentence1 = reverse(input1);
  console.log(reversedSentence1);
  
  const input2 = "What the hell are you doing??";
  const reversedSentence2 = reverse(input2);
  console.log(reversedSentence2);
