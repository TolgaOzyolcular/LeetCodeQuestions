
public class StudentAttendanceRecordI {
	
	public static boolean checkRecord(String s) {
        int A = 0;
        
        if(s.contains("LLL")) 
                return false;
        
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A') {
                A++;
                if(A == 2)
                    return false;
            }                                                        
        }

        return true;
    }

}
