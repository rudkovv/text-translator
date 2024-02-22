package com.translator.program.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.translator.program.entity.TranslateWord;
import com.translator.program.service.MyService;


@RestController
public class MyController {
	@GetMapping("/translate")
    public TranslateWord translate(
            @RequestParam(name="name", required=false, defaultValue="Word") String name,
           Model model) {
    	TranslateWord word = new TranslateWord(name, "Слово");
    	MyService translater = new MyService(word);
    	return translater.getTranslate();
    }
    @GetMapping("/")
    public ModelAndView main(Model model) {
    	return new ModelAndView("main");
    }
}