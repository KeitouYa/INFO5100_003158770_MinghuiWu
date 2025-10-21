# Exercise 1A - Number Guessing Game with a Menu

## 🖥️ Test Results

### 1. Correct Guess Case
**Description:**  
Player guesses the correct number before using all 5 attempts.  
**Expected behavior:**  
- Program shows `"Correct!"` and ends the round immediately.  
- Menu appears again after the game ends.

**Sample Output:**
<img width="774" height="833" alt="image" src="https://github.com/user-attachments/assets/e6a4d9bd-fda6-4877-be7d-240677cfd0e4" />


### 2. Five Attempts Used
**Description:**  
Player fails to guess the number in 5 attempts.  
**Expected behavior:**  
- After 5 tries, program reveals the correct number.  
- Menu appears again.

**Sample Output:**
<img width="873" height="896" alt="image" src="https://github.com/user-attachments/assets/bc2626ee-e469-419d-8a3c-bc76633418d0" />

### 3. Invalid Input – Non-numeric Test
This test checks whether the program correctly handles **non-numeric input** using `try-catch`.

#### (a) Invalid Input at Main Menu
**Action:** Entering a letter or symbol instead of 1 or 2.  
**Expected behavior:**  
- Program displays “Invalid input, please enter an integer:”  
- Prompts the user again without crashing.

**Sample Output:**
<img width="754" height="527" alt="image" src="https://github.com/user-attachments/assets/bb01df9d-67e1-4f8b-a416-9464b684e50f" />

#### (b) Invalid Input During Guess
**Action:** Entering a letter or symbol while guessing.  
**Expected behavior:**  
- Program displays “Invalid input, please enter an integer:”  
- Continues current game attempt without breaking.

**Sample Output:** 
<img width="732" height="521" alt="image" src="https://github.com/user-attachments/assets/c27c0c2f-0219-4b6d-b4d8-e3b2332ff1be" />


### 4. Out-of-range Number Test
This test verifies if the program rejects numbers outside the valid range.

#### (a) Out-of-range Input at Main Menu
**Action:** Entering 3 or 0 when asked to choose between 1 and 2.  
**Expected behavior:**  
- Program displays “The input must be between 1 and 2, please try again:”  
- Keeps prompting until valid input is entered.

**Sample Output:**
<img width="894" height="611" alt="image" src="https://github.com/user-attachments/assets/90e8065c-dee9-42e7-b85c-834936c30b34" />

#### (b) Out-of-range Input During Guess
**Action:** Entering a number smaller than 1 or greater than 10.  
**Expected behavior:**  
- Program displays “The input must be between 1 and 10, please try again:”  
- Prompts again for a valid number without reducing attempt count.

**Sample Output:**
<img width="901" height="474" alt="image" src="https://github.com/user-attachments/assets/4d33b031-8cc3-46c4-8d9c-989f25df82a5" />

