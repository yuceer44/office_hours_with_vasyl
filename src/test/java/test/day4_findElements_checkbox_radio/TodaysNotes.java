package test.day4_findElements_checkbox_radio;

public class TodaysNotes {
}

/*
JUN 12, FRIDAY

Absolute xpath:
	-> Starts with : /
	-> Starts from the very beginning of <html>
	-> You can only go from parent to child

Relative xpath:
	-> Starts with: //
	-> Looks through everything in the html code
	-> Returns all matching
	-> You can start from anywhere in the html code
	-> Where ever you use // (relative path) is looking to jump and return all the matching results
		ex : //body//a

Side note;
	-> When there is a task, download the pdf then copy paste text task into intelliJ.
	-> This will help keeping the number structure of the task

Commonly used xpaths
	1- //tagName[@attribute='value']
	2- //tagName[.='text']
		--> looks for matching text value

	//a[.='iPhone']
	//span[.='iPhone']

	. -->  means class in cssSelector. Not in xpath.

-->	Locating the same webElement using this syntax:
	//tagName[@attribute='value']
	//*[@attribute='value']

		-> when we use * instead of tagName, it will not check tagName.
		->It will only check attributes and values. And return matching one(s).

	#1 -> using class atribute value :
		//a[@class='ac-gn-link ac-gn-link-iphone']

	#2 -> using href attribute value :
		//a[@href='/iphone/']

		(//a[@href='/iphone/'])[1] --> this is returning me two web elements

		If your xpath is returning you more than one web elements and you want to specify which one you get, you surround the xpath with (), and pass the index number in []

	#3 -> //a[@data-analytics-title='iphone']
		(//a[@data-analytics-title='iphone'])[1]

		-> If the webelements are siblings to each other, you dont have to surround with paranthesis. You can directly pass index number using []

	#4 -> Locating a child and going to parent : We need to use /.. to go to parent
		//span[.='iPhone']/..

	#5 -> Using * instead of tagName
		//*[@class='ac-gn-link ac-gn-link-iphone']


	FINDING FROM PARENT: //li[@class='ac-gn-item ac-gn-item-menu ac-gn-iphone']/a
	Basically locate a unique parent, then move to the child using / until you reach desired web element

	--> Why different people getting different number of links even we all go to same page?
		-> could be because OS difference: MAC vs Windows
		-> could be different browsers
		-> could be same browser but different version etc.
		-> could be the screensize effecting something

//OFFICE HOURS ON THIS SATURDAY --> 2PM-4PM EST








 */