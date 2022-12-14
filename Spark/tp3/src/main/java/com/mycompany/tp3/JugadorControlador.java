package com.mycompany.tp3;

import spark.Request;
import spark.Response;
import spark.Route;
import java.util.*;
import java.util.HashMap; 
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
/**
 *
 * @author Usuario
 */
public class JugadorControlador {

    public static Route getDetalleEquipo = (Request request, Response response) -> {
        JugadorDAO pDAO = new JugadorDAO(); 
        String idEquipo = request.queryParams("idEquipo");
        List<Jugador> j = pDAO.getDetalleEquipo(idEquipo); 
        
        HashMap model = new HashMap();
        model.put("jugadores", j);
        model.put("template", "templates/detalleequipo.vsl");
        
        Menu menu = new Menu();
        model.put("menu", menu.getMenu());  
        model.put("menuActivo", "listaequipos");
        
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
    };
    
    public static Route getDetalleJugador = (Request request, Response response) -> {
        JugadorDAO pDAO = new JugadorDAO();
        String id = request.queryParams("id");
        List<Jugador> j = pDAO.getDetalleJugador(id); 
        
        HashMap model = new HashMap();
        model.put("jugadores", j);
        model.put("template", "templates/detallejugador.vsl");
        
        Menu menu = new Menu();
        model.put("menu", menu.getMenu());  
        model.put("menuActivo", "listaequipos");
        
        return new VelocityTemplateEngine().render(new ModelAndView(model, "templates/layout.vsl"));
    };
    
}
