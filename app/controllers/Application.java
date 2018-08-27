package controllers;

import models.Shoes;
import models.Register;
import models.InputShoes;
import models.InputShoesPicture;
import play.*;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Application extends Controller {
    public static Result showmain(Html main) {return ok(main_page.render(main));}


    public static Result index() {return showmain(home.render());}

    public Form<Register> registerForm = Form.form(Register.class);

    public static InputShoes inputShoes;
    public static Form<InputShoes> inputShoesForm = Form.form(InputShoes.class);
    public static List<InputShoes> inputShoesList = new ArrayList<InputShoes>();

    public static InputShoesPicture inputShoesPicture;
    public static Form<InputShoesPicture> inputShoesPictureForm = Form.form(InputShoesPicture.class);
    public static List<InputShoesPicture> inputShoesPictureList = new ArrayList<InputShoesPicture>();

    public static String comPicPath = Play.application().configuration().getString("com_pic_path");





    public static Result showAdidas(){
        Shoes s1 = new Shoes();
        s1.setId("S001");
        s1.setName("Ultraboost Uncaged Shoes");
        s1.setAmount(7000);
        s1.setUnit(10);
        s1.setBrand("Adidas");
        s1.setSize(8);

        Shoes s2 = new Shoes("S002", "Ultraboost Shoes", 7300, 5, "Addidas", 9);
        Shoes s3 = new Shoes("S003", "Ultraboost Shoes", 6300, 5, "Addidas", 9);
        Shoes s4 = new Shoes("S004", "Duramo Slides Shoes", 3500, 8, "Addidas", 6);
        Shoes s5 = new Shoes("S005", "Lite Racer BYD Shoes Shoes", 3800, 12, "Addidas", 8);
        Shoes s6 = new Shoes("S006", "Prophere Shoes Shoes", 3950, 12, "Addidas", 8);
        Shoes s7 = new Shoes("S007", "I-5923 Shoes Shoes", 7000, 6, "Addidas", 10);
        Shoes s8 = new Shoes("S008", "Continental 80 Shoes Shoes", 6500, 10, "Addidas", 7);

        return showmain(adidas_page.render(s1,s2,s3,s4,s5,s6,s7,s8));
    }

    public static Result showNike(){
        Shoes s1 = new Shoes();
        s1.setId("S009");
        s1.setName("NIKE AIR ZOOM MARIAH FK RACER 600");
        s1.setAmount(6500);
        s1.setUnit(5);
        s1.setBrand("Nike");
        s1.setSize(8);

        Shoes s2 = new Shoes("S0010", "NIKE PRE LOVE O.X (WOMEN) 002", 6500, 6, "Nike", 10);
        Shoes s3 = new Shoes("S0011", "FAST EXP-Z07 RACER - BLACK/TOTAL CRIMSON-003", 3500, 7, "Nike", 7);
        Shoes s4 = new Shoes("S0012", "FAST EXP-Z07 RACER - WHITE/BLACK", 3300, 4, "Nike", 8);
        Shoes s5 = new Shoes("S0013", "NIKE AIR MAX 93 OG DUSTY CACTUS 100", 5000, 5, "Nike", 7);
        Shoes s6 = new Shoes("S0014", "NIKE AIR MAX 180 OG “ULTRAMARINE 100", 5000, 6, "Nike", 7);
        Shoes s7 = new Shoes("S0015", "NIKE AIR MAX 270", 5500, 8, "Nike", 6);
        Shoes s8 = new Shoes("S0016", "NIKE AIR FORCE 1 07 LX BLACK 009", 4400, 7, "Nike", 8);
        return showmain(nike_page.render(s1,s2,s3,s4,s5,s6,s7,s8));
    }

    public static Result showVans(){
        Shoes s1 = new Shoes();
        s1.setId("S0017");
        s1.setName("VANS UA OG SLIP-ON 59 LX SMOKE");
        s1.setAmount(3500);
        s1.setUnit(5);
        s1.setBrand("Nike");
        s1.setSize(8);

        Shoes s2 = new Shoes("S0018", "VANS UA OG STAYLE 43 LX CANVAS HONEY", 2990, 2, "Vans", 8);
        Shoes s3 = new Shoes("S0019", "VANS UA OG STAYLE 43 LX CANVAS SMOKE", 2990, 3, "Vans", 9);
        Shoes s4 = new Shoes("S0020", "VANS U OG CLASSIC SLIP-ON PEACOAT", 2990, 5, "Vans", 7);
        Shoes s5 = new Shoes("S0020", "VANS U OG CLASSIC SLIP-ON BLACK", 3500, 4, "Vans", 8);
        Shoes s6 = new Shoes("S0020", "VANS UA OG STAYLE 43 LX CANVAS RED", 2990, 2, "Vans", 9);
        Shoes s7 = new Shoes("S0020", "VANS U OG CLASSIC SLIP-ON BLACK WHITE", 2990, 3, "Vans", 9);
        Shoes s8 = new Shoes("S0020", "VANS UA OG SLIP-ON 59 LX RED", 3500, 5, "Vans", 8);
        return showmain(vans_page.render(s1,s2,s3,s4,s5,s6,s7,s8));
    }

    public  static Result register(){
        return showmain(register_page.render());
    }

    public static Result showregister(){
        DynamicForm myForm = Form.form().bindFromRequest();
        String username,password,name,add,email,tel;


        username = myForm.get("username");
        password = myForm.get("password");
        name = myForm.get("name");
        add = myForm.get("add");
        email = myForm.get("emil");
        tel = myForm.get("tel");

        return showmain(showregister_page.render(username,password,name,add,email,tel));
    }

    public static Result sale(){ return showmain(sale_page.render());}

    public static Result register_form_helper(){
        return ok();
    }

    public static Result register_post_helper(){
        return ok();
    }

    public static Result inputshoes_form_helper(){
        inputShoesForm = Form.form(InputShoes.class);
        return showmain(inputshoes_form_helper.render(inputShoesForm));
    }

    public static Result inputshoes_post_helper(){
        Form<InputShoes> newForm = inputShoesForm.bindFromRequest();
        if(newForm.hasErrors()){
            return showmain(inputshoes_form_helper.render(newForm));
        }
        else {
            inputShoes = newForm.get();
            return showmain(inputshoes_post_helper.render(inputShoes));
        }
    }



    public static Result inputshoes_form_list(){
        inputShoesForm = Form.form(InputShoes.class);
        return showmain(inputshoes_form_list.render(inputShoesForm));
    }

    public static Result inputshoes_post_list(){
        Form<InputShoes> newForm = inputShoesForm.bindFromRequest();
        if(newForm.hasErrors()){
            return showmain(inputshoes_form_list.render(newForm));
        }
        else {
            inputShoes = newForm.get();
            inputShoesList.add(inputShoes);
            return showmain(inputshoes_post_list.render(inputShoesList));
        }
    }

    public static Result inputshoes_picture_form_list(){
        inputShoesPictureForm = Form.form(InputShoesPicture.class);
        return showmain(inputshoes_picture_form_list.render(inputShoesPictureForm));
    }

    public static Result inputshoes_picture_post_list() {
        Form<InputShoesPicture> myForm = inputShoesPictureForm.bindFromRequest();
        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart picture = body.getFile("picture");
        String fileName, contentType;
        if (myForm.hasErrors()) {
            return showmain(inputshoes_picture_form_list.render(myForm));
        } else {
            if (picture != null) {
                contentType = picture.getContentType();
                File file = picture.getFile();
                fileName = picture.getFilename();
                if (!contentType.startsWith("image")) {
                    return showmain(inputshoes_picture_form_list.render(myForm));

                }
                inputShoesPicture = myForm.get();
                fileName = inputShoesPicture.getId() + fileName.substring(fileName.lastIndexOf("."));
                file.renameTo(new File(comPicPath, fileName));
                inputShoesPicture.setPicture(fileName);
                inputShoesPictureList.add(inputShoesPicture);
                return showmain(inputshoes_picture_post_list.render(inputShoesPictureList));
            }

        }

        return showmain(inputshoes_picture_post_list.render(inputShoesPictureList));
    }

    public static Result showDatainput(String id){
        for(int i=0;i< inputShoesPictureList.size();i++){
            if(inputShoesPictureList.get(i).getId().equals(id))
                inputShoesPicture = inputShoesPictureList.get(i);
            break;
        }
        return showmain(showDatainput.render(inputShoesPicture));
    }
}
