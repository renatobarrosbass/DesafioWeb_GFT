package util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class GeradorArquivoScreenshot {
        public static String dateTimeForFile (){
            Timestamp ts = new Timestamp(System.currentTimeMillis());
            return new SimpleDateFormat("yyyyMMddhhmmss").format(ts);
        }
}

