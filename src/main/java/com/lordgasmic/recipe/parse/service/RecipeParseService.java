package com.lordgasmic.recipe.parse.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.lordgasmic.recipe.parse.model.Recipe;

@Service
public class RecipeParseService {

    public Recipe get(String url) throws IOException {
        Parser parser = ParserFactory.allRecipesParser();
        return parser.parse(url);
    }

}
