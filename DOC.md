# Document Design Decisions 
### 1. Explain the reasoning behind your approach. 
   - The main way I implement the algorithm works like this: we scan the file, 
   each string, we transform into a list of chars, and then sort it alphabetically in order to determine a signature. 
   Then we simply group the words with the same signature as that would mean that they are anagrams. 
   - The main elements of this programme are the fact that I used a Map<String, List<String>>, where the key represents the signature, and the value the list of the anagrams.


### 2. Consider aspects such as maintainability, scalability, and performance.
   - I used BufferedReader and BufferedWriter for example instead of using Files.readAllLines() or the similar for writing, which is a more performant solution as it's more memory efficient compare to for example reading all the file at once.


### 3. If you use any external libraries, justify your choice.
   - Used only Standard Java Library.  

# Scalability Considerations 
### 1. How would your solution handle 10 milion words? 
   - The current solution I think could work with 10 milion words, but it would depend on the machine that it is running on to, if there is enough memory available, as all the words are read into memory. 

### 2. What changes would be needed for 100 billion words?
   - For 100 billion words, my solution won't work most probably, a better solution would be probably to take advantage of multithreading or use some instance of divide and conquer, or maybe use some type of distributed processing system where multiple interconnected devices would work together to distribute the workload of 100 billion words.

### 3. Provide a brief explanation of how you would scale your solution to support large datasets.
   - I probably would scale my solution in these ways: we should process the anagrams immediately and not store them in  a list, as a big list could overload the memory, work in chunks and write to file a section before working on the next section, or use tools that would allow parallel processing and group different machines based on the task they do. 