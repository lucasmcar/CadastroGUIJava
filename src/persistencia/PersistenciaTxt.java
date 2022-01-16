
package persistencia;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import vo.VeiculoVo;

public class PersistenciaTxt  {
    
    public static boolean salvarDados(VeiculoVo vo){
        

        try{
            OutputStream os = new FileOutputStream("veiculo.txt", true);
            Writer wr = new OutputStreamWriter(os);
            try (PrintWriter pw = new PrintWriter(wr)) {
                pw.print(vo.getNome()+";");
                pw.print(vo.getMarca()+";");
                pw.print(Integer.toString(vo.getQtdPortas())+";");
                pw.print(vo.getCor()+";");
                pw.print(vo.getPlaca());
                pw.println();
                pw.flush();
            }
        }catch(Exception ex){
            ex.getMessage();
        }
        
        return true;
    }
}
