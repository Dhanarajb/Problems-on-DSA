const IsSorted = (arr) => {
  for (let i = 1; i < arr.length - 1; i++) {
    if (arr[i] > arr[i + 1]) {
      return false;
    }
  }
  return true;
};
const result = IsSorted([1, 2, 9, 4, 5]);
console.log(result);
