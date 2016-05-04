package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyBlE8PXWXsbKQkSChTQra8BMV31AoyD9Vs";
        Content content = createContent();


        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bFrZYVSkRIIKf-KN9LfmwuHgZzn_NQRHjAFrpkfZ0g2EZGNRY2JkJSfsAp8ptezCBmDLZasrBudgtTkW4k538EPy0yXawx-oxn9bNOXysefTtgawy0eWLLvUPW9-a7qABhgTz0q");

        c.createData("Working!!", "Test message");

        return c;
    }
}

