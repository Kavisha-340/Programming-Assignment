def is_vowel_present(string):
    vowels = "aeiouAEIOU"
    
    for char in string:
        if char in vowels:
            return True
    
    return False

# Example usage:
input_string = input("Enter a string: ")
if is_vowel_present(input_string):
    print("Vowel is present in the string.")
else:
    print("No vowel is present in the string.")
