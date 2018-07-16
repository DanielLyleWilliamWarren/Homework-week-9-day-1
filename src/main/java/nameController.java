import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import static spark.Spark.get;

public class nameController {

    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();



        get("/one" ,(req, res) -> {
            Name name = new Name();
            String foundName = name.getRandomNames();

            HashMap<String, Object> model = new HashMap<>();
            model.put("name", foundName);
            return new ModelAndView(model, "one.vtl");
        }, velocityTemplateEngine);

        get("/two" ,(req, res) -> {
            Name name = new Name();
            ArrayList<String> twoNames = name.getRandomTwoNames();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", twoNames);
            return new ModelAndView(model, "two.vtl");
        }, velocityTemplateEngine);

        get("/three" ,(req, res) -> {
            Name name = new Name();
            ArrayList<String> threeNames = name.getRandomThreeNames();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", threeNames);
            return new ModelAndView(model, "three.vtl");
        }, velocityTemplateEngine);

        get("/four" ,(req, res) -> {
            Name name = new Name();
            ArrayList<String> fourNames = name.getRandomFourNames();

            HashMap<String, Object> model = new HashMap<>();
            model.put("names", fourNames);
            return new ModelAndView(model, "four.vtl");
        }, velocityTemplateEngine);
    }
}

