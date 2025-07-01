function ContainsDuplicate(nums) {
  return new Set(nums).size < nums.length;
}

console.log(ContainsDuplicate([1, 2, 3, 3]));
