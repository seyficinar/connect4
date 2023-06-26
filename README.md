Connect4 game with basic AI
Description and criteria of the project: 

Project Description:
The goal of this project is to design and implement a Java Connect 4 game, where computer plays against
a human. Connect 4 is a two-player strategy board game that is played on a vertical grid with 7 columns
and 6 rows. Each player takes turns dropping colored coins, usually red and yellow, from the top of the
grid into one of the columns. The coins will fall to the lowest available slot in the column, filling the grid
from bottom up. The objective of the game is to connect four of your own colored coins in a horizontal,
vertical, or diagonal line, while also trying to block your opponent from making their own line.
The game starts with an empty grid and players take turns dropping their coins into the columns, starting
with the first player. Once a coin is dropped, it cannot be moved or removed from the grid. Players can
only drop their coins into columns that have available slots, and the coins will always fall to the lowest
available slot in that column.
The game ends when one player successfully connects four of their own coins in a horizontal, vertical, or
diagonal line. The player who achieves this first is declared the winner. If all slots in the grid are filled
and no player has connected four coins, the game is considered a draw.

Your project consists of 2 parts:
1 - Design (40 points):
The design part of the project requires creating a detailed plan of the game's architecture and functionality.
The following components need to be addressed in the design phase:
● Game rules and mechanics (20 points): The game mechanics should be clearly defined, including
the win/loss conditions and the actions that players can take during their turns.
● User interface (5 points): The interface should be intuitive and user-friendly, allowing players to
interact with the game in a simple and engaging way. Although implementing a GUI is not strictly
necessary, you can give it a try if you're feeling adventurous and want to take on the challenge.
● Data structures (15 points): Students are required to use a tree data structure to calculate the
computer's actions. The design should include necessary class/method definitions of the required
tree structure to be used to determine the best moves for the computer player.
2 - Implementation (60 points):
The implementation phase of the project requires students to create the Java Connect 4 game based on
their design. The following components need to be addressed in the implementation phase:
● Game mechanics (20 points): The game should function according to the rules and mechanics
outlined in the design phase.
● User interface (5 points): The interface should be implemented according to the design phase and
should be user-friendly and engaging.
● Data structures (15 points): The tree data structure should be implemented and used to calculate
the computer player's actions.
● Algorithm (20 points): The computer player algorithm should be implemented efficiently and
optimized for the game.
IMPORTANT NOTES:
● You can use any data structure you wish in all modules except for the computer player
module.
● You must use tree data structure for computer player algorithm. Any other implementation
is prohibited and will get a 0 in this project.
● The assignment will be tested by playing your game, any issue that causes your final
submission to be unplayable will receive a severe point penalty.
● You MUST accept the GitHub assignment with your name only. Those that can not be
verified will receive 0.
● If you submit/commit an implementation in the first part of the project containing any piece
of code other than the method signatures, attributes, and Javadoc, you will get a 0 in this
project.
● Your commit frequency and the content will be graded.
● If you don’t submit the first part of the project, you cannot submit the second part.
● External library usage is forbidden.
