/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.*;
import java.awt.Color;
/**
 *
 * @author Estudiante
 */
public class EjercicioKarel {
    private City ciudad;
    private Robot robot;
    
    public EjercicioKarel(){
        this.ciudad = new City();
        for(int c = 1; c <= 7; c++){
            Wall pared = new Wall(ciudad, 1, c, Direction.NORTH);
            Wall colum = new Wall(ciudad, c, 1, Direction.WEST);
            Wall acolum = new Wall(ciudad, c, 7, Direction.EAST);
            Wall piso = new Wall(ciudad, 7, c, Direction.SOUTH);
        }
        
        Thing thing = new Thing(ciudad, 2, 2);
        thing.getIcon().setColor(Color.LIGHT_GRAY);
        thing.getIcon().setLabel("Placa");
        
        this.robot = new Robot(ciudad, 3, 3, Direction.EAST);
        this.robot.setLabel("Robot");
        this.robot.setColor(Color.MAGENTA);
        
        
    }
    
    public void solucionarReto(){
        for (int i = 0; i < 3; i++) {
            this.robot.move();
        }
    }
}
