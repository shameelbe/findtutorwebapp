package com.findtutor;


import com.findtutor.web.i18n.I18NService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FindtutorApplication.class)
@WebAppConfiguration
public class FindtutorApplicationTests
{
    @Autowired
    private I18NService i18NService;

    @Test
    public void testMessageByLocaleService() throws Exception
    {
        String expectedResult = "Welcome! Find your tutor. It is very easy";
        String messageId = "index.main.callout";
        String actual = i18NService.getMessage(messageId);
        Assert.assertEquals("The actual and expected Strings don't match", expectedResult, actual);
    }
}
