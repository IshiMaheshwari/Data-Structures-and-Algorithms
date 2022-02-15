def containsDuplicate(numbers):
	return len(numbers)!=len(set(numbers))
print(containsDuplicate([1,2,3,4,5]))
print(containsDuplicate([1,3,4,5,7,3]))