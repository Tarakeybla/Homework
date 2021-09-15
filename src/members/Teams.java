package members;

    public class Teams {

        String teamName;
        Capabilities[] teamMembers = new Capabilities[4];


        public Teams(String teamName, Capabilities[] teamMembers){
            this.teamName = teamName;
            this.teamMembers = teamMembers;
        }

        public String getTeamName(){
            return "Team name: "+teamName;
        }

        public Capabilities[] getMembers(){
            return teamMembers;
        }

        public void showResults(){
            for(Capabilities c: teamMembers){
                c.showResult();
            }
        }

        public void showMembersFinishedCourse(){
            for(Capabilities c: teamMembers){
                if(c.isOnDistance())
                    c.showResult();
            }
        }
    }
