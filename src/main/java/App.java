import java.util.HashMap;
import java.util.Random;
import java.io.*;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    // String layout = "templates/layout.vtl";
    //
    // get("/", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // get("/detector", (request, response) -> {
    //   HashMap<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/detector.vtl");
    //
    //   String playerOneThrow = request.queryParams("optionsRadios");
    //   String winner = defineWinner(playerOneThrow, computerChooses());
    //   model.put("winner", winner);
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }




  public static String replaceWord(String userSentence, String wordToReplace, String replaceWith) {
    String newSentence = userSentence.replaceAll(wordToReplace, replaceWith);
    return newSentence;
  }
}
