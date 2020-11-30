package com.company;

public class Main {

    public static void main(String[] args) {
        PostIt orange = new PostIt();
        PostIt pink = new PostIt();
        PostIt yellow = new PostIt();

        orange.textColor = "blue";
        orange.backgroundColor = "orange";
        orange.text = "Ötlet 1";

        pink.textColor = "black";
        pink.backgroundColor = "pink";
        pink.text = "Csodálatos";

        yellow.textColor = "green";
        yellow.backgroundColor = "yellow";
        yellow.text = "Fenséges";

        BlogPost loremIpsum = new BlogPost();
        loremIpsum.title = "Lorem Ipsum";
        loremIpsum.authorName = "John Doe";
        loremIpsum.publicationDate = "2010.10.10.";
        loremIpsum.text = "2010.10.10.";

        BlogPost waitButWhy = new BlogPost();
        waitButWhy.title = "Wati but why";
        waitButWhy.authorName = "Tim Urban";
        waitButWhy.publicationDate = "2010.10.10.";
        waitButWhy.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

        BlogPost oneEngeneer = new BlogPost();
        oneEngeneer.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
        oneEngeneer.authorName = "William Turton";
        oneEngeneer.publicationDate = "2017.03.28.";
        oneEngeneer.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.";






    }
}
