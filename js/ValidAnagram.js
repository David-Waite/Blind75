function isAnagram(s, t) {
  if (s.length !== t.length) return false;

  let freqMap = new Map();

  for (const letter of s) {
    freqMap.set(letter, (freqMap.get(letter) || 0) + 1);
  }

  for (const letter of t) {
    if (freqMap.has(letter)) {
      if (freqMap.get(letter) == 0) return false;
      freqMap.set(letter, freqMap.get(letter) - 1);
    } else {
      return false;
    }
  }
  return true;
}

console.log(isAnagram("jar", "jam"));
