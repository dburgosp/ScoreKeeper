# Score Keeper App

This is a very simple Android Studio project for the [Android Basics Nanodegree](https://www.udacity.com/course/android-basics-nanodegree-by-google--nd803) given by Udacity and Google. The goal was to create an Score Keeper app which gave a user the ability to keep track of the score of two different teams playing a game of our choice. I chose **football**:

![Score Keeper App](https://github.com/dburgosp/ScoreKeeper/blob/master/img_score_keeper.jpg?raw=true)

# Project Specifications

## Layout

1. **Game Chosen**. The chosen game has either multiple amounts of points that can be scored, as in american football, or multiple important metrics to track, such as fouls, outs, and innings in baseball.
2. **Overall layout**. App is divided into two columns, one for each team.
3. **Column contents**. Each column contains a large [TextView](https://developer.android.com/reference/android/widget/TextView.html) to keep track of the current score for that team. Optionally, a second TextView to track another important metric such as fouls can be added.
4. **Score buttons**. Each column contains multiple buttons. The buttons must track either:
   * Each track a different kind of scoring or
   * Each track a different metric (one score, the other fouls, for instance).
5. **Reset button**. The layout contains a ‘reset’ button.
6. **Best practices**. The code adheres to all of the following best practices:
   * Text sizes are defined in sp.
   * Lengths are defined in dp.
   * Padding and margin is used appropriately, such that the views are not crammed up against each other.

## Functionality

1. **Errors**. The code runs without errors.
2. **Score Button Function**. Each score button updates the score TextView in its column by adding the correct number of points.
3. **Reset Button Function**. The reset button resets the scores on both of the score TextViews.

## Code Readability

1. **Naming conventions**. Any classes are named after the object they represent. All variables are named by their intended contents. All methods are named by their intended effect or in the style required by a callback interface.
2. **Code style**. There are no unnecessary blank lines.One variable is declared per declaration line. The code within a method is indented with respect to the method declaration line.
