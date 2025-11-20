# Unit 3 - Data for Social Good Project

## Introduction

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program:
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors.
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about.
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset).
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As an constant mukbanger influencer, <br> 
> I want to analyze the nutrition facts of common fast food places, <br> 
> so that I can easily find which food items have the highest calories.

## Dataset 

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type. 

Dataset: https://studio.code.org/data_docs/fast-food-nutrition/ 
- **Name** (String) - name of fast food item
- **Type** (String) - the category the item fits under (ex: "Chicken" or "Waffle")
- **Vendor** (String) - the name of the vendor that produces that item(ex: "McDonalds" or "Popeyes")
- **Calories** (int) - the number of calories per serving of that item

## UML Diagram 

Put an image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get displayed on this README. 

![UML Diagram for unit 3 project](![alt text](<Screenshot 2025-11-19 225056-1.png>)) 

## Description 


Our fast food nutrition code assists mukbangers in fiding the most caloric fast food items. The dataset used contails text files with food names, food types/categories, vendors, and number of calories. We used methods to find highest calorie counts for a food type or vendor, using loops with conditionals to search the arrays and intake user input. Using the scanner class, users can choose 1 or 2, 1 being searching highest caloric food item under a vendor, and 2 being searching highest caloric food item under a food category. The console returns the item with the most calories, the amount of calories it has, and the official food name. The program also returns a "Would you like to continue?" question for users to respond to by their choice. Also, when they type something wrong a warning, "That's not a choice, try again!" shows up. 