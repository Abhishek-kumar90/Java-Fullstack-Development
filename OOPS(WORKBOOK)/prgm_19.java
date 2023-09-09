public class prgm_19 {

    interface inter11 {
        void show();
    }

    interface inter22 {
        int show(int a );
    }

    static class cd implements inter11, inter22 {

        public void show() {
            // Implement the method for inter11
        }

        public int show(int x) {
            // Implement the method for inter22
            return 0; // Provide a valid return value
        }
    }

    static class Ab implements inter11 {
        public void show() {
            // Implement the method here
        }
    }

    static class Bc implements inter22 {
        public int show() {
            return 0; // Provide a valid return value
        }
    }
}
