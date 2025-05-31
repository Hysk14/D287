<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION
CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY
STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY

## D287 – JAVA FRAMEWORKS

Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage
existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.

## BASIC INSTRUCTIONS

For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this
assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer
to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address.
Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will
download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ
IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a
part of this, you have been provided with a base code (starting point).

## Project Changes

C. Customize the HTML user interface for your customer’s application. The user interface should include the shop name,
the product names, and the names of the parts.

Changes:

File Name: mainscreen.html
Line Number: 14
Change: changed title from "My Bicycle Shop" to "Kaio's PC Shop"

File Name: mainscreen.html
Line Number: 19
Change: changed h1 from "Shop" to "Kaio's PC Shop"

File Name: mainscreen.html
Line Number: 21
Change: changed h2 from "Parts" to "PC Parts"

File Name: mainscreen.html
Line Number: 53
Change: changed h2 from "Products" to "Pre-built PC's"

File Name: mainscreen.html
Line Number: 16-25
Change: added style tags, background image, and altered text color to "white"

File Name: mainscreen.html
Line Number: 26
Change: added group selector for th (table header) and td (table data) for styling

D. Add an “About” page to the application to describe your chosen customer’s company to web viewers and include
navigation to and from the “About” page and the main screen.

Changes:

File Name: about.html
Line Number: 14
Change: added "About Us" title

File Name: about.html
Line Number: 16, 22
Change: added body tag

File Name: about.html
Line Number: 18, 20
Change: added div tag with "container" class

File Name: about.html
Line Number: 19
Change: added h1 tag with "About Us"

File Name: about.html
Line Number: 19
Change: added "text-center" class to h1 tag

File Name: about.html
Line Number: 19
Change: added "mt-5 display-1" class to h1 tag for top margin and larger text size

File Name: about.html
Line Number: 16-24
Change: added style tag, body, and background code to set background image for about page

File Name: about.html
Line Number: 23
Change: changed all text color to white

File Name: about.html
Line Number: 34-37
Change: update "about us" paragraph text and styling

File Name: about.html
Line Number: 17-31
Change: customized paragraph, h1, and border elements

File Name: AboutController.java
Line Number: 7-15
Change: added Controller to handle/map "about" page

File Name: mainscreen.html
Line Number: 35
Change: added button for navigation from home page to "about us" page

File Name: about.html
Line Number: 46, 48
Change: centered text for home navigation button, added button for navigation from about us page to "home" page

E. Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five
products in your sample inventory and should not overwrite existing data in the database.

File Name: BootStrapData.java
Line Number: 59-97
Change: added 5 parts to inventory

File Name: BootStrapData.java
Line Number: 111-120
Change: added 5 products to inventory

File Name: BootStrapData.java
Line Number: 58-106
Change: Added if() statement to check if part/product exists before creating to avoid duplicate entries

- Updated README.md
- File Name: BootStrapData.java
  Line Number: 43-51
  Changes: added database clearing method to remove duplicates and test code

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the
sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your
products. When duplicate items are added, make a “multi-pack” part.

F. Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
• The “Buy Now” button must be next to the buttons that update and delete products.
• The button should decrement the inventory of that product by one. It should not affect the inventory of any of the
associated parts.
• Display a message that indicates the success or failure of a purchase.

- Updated README.md
- File Name: mainscreen.html
  Line Number: 65, 102
  Change: added visual ONLY "Buy Now" button for both parts and products.

- Updated README.md
- File Name: mainscreen.html
  Line Number: 65
  Change: removed "Buy Now" button from parts table

G. Modify the parts to track maximum and minimum inventory by doing the following:
• Add additional fields to the part entity for maximum and minimum inventory.
• Modify the sample inventory to include the maximum and minimum fields.
• Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set
the maximum and minimum values.
• Rename the file the persistent storage is saved to.
• Modify the code to enforce that the inventory is between or at the minimum and maximum value.

- File Name: Part.java
  Line Number: 31-34
  Change: added fields for minimum/maximum inventory

- File Name: Part.java
  Line Number: 50, 55, 56
  Change: added minInv/maxInv to Part constructor parameters, assigned parameters to instance variables

- File Name: Part.java
  Line Number: 90-97
  Change: added setter/getter methods for minInv/maxInv

- File Name: BootStrapData.java
  Line Number: 61, 62, 71, 72, 81, 82, 91, 92, 101, 102
  Change: set min/max inventory values

- File Name: InhousePartForm.html
  Line Numbers: 32-41
  Changes: added fields for min/maxInv entry

- File Name: OutsourcedPartForm.html
  Line Numbers: 33-43
  Changes: added fields for min/maxInv entry

- File Name: application.properties
  Line Numbers: 6
  Changes: changed datasource.url to reflect name changes to D287

H. Add validation for between or at the maximum and minimum fields. The validation must include the following:
• Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum
number of parts.
• Display error messages for low inventory when adding and updating products lowers the part inventory below the
minimum.
• Display error messages when adding and updating parts if the inventory is greater than the maximum.

I. Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J. Remove the class files for any unused validators in order to clean your code.