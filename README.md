# Concurrency-in-Java

### Objective
The objectives of this project are to convert a description of a system into a simulation model of that system; to implement that simulation in a shared memory concurrent programming language; to use the implemented simulation to explore the behaviour of the system; to gain a better understanding of safety and liveness issues in concurrent systems.

### Description
In an alternate version of our Earth, a genetic mutation causes some people, known as Z-folk, to be
born with superhuman abilities which they use to fight crime. These Superheroes are led by Profes-
sor Z, whose Mansion they regularly gather in discuss world affairs. Within the Mansion is a Secret
Room, where Professor Z and the superheroes meet to allocate crime-fighting Missions.
Within the Mansion, Professor Z and the superheroes interact according to a set of strict rules. Su-
perheroes enter the Mansion, discuss world affairs, and enter the Secret Room (see Figure 1 for a
schematic of the system). While Professor Z is in the Mansion, no more superheroes may enter or
leave the Mansion. Once all superheroes who are present in the Mansion have also entered the Secret
Room, Professor Z starts a meeting in the Secret Room. During a meeting, superheroes report back
on and release their completed Missions (if they had one) and acquire new Missions. Once a super-
hero has acquired a new Mission, they may leave the Secret Room, and spend more time discussing
world affairs. Once all superheroes have left the Secret Room, Professor Z ends the meeting and, at
some point after this, leaves the Mansion. The superheroes are then free to leave the Mansion and
complete their Missions. After completing a Mission, a superhero once more returns to the Mansion,
and the process begins again.n an alternate version of our Earth, a genetic mutation causes some people, known as Z-folk, to be
born with superhuman abilities which they use to fight crime. These Superheroes are led by Profes-
sor Z, whose Mansion they regularly gather in discuss world affairs. Within the Mansion is a Secret
Room, where Professor Z and the superheroes meet to allocate crime-fighting Missions.
Within the Mansion, Professor Z and the superheroes interact according to a set of strict rules. Su-
perheroes enter the Mansion, discuss world affairs, and enter the Secret Room (see Figure 1 for a
schematic of the system). While Professor Z is in the Mansion, no more superheroes may enter or
leave the Mansion. Once all superheroes who are present in the Mansion have also entered the Secret
Room, Professor Z starts a meeting in the Secret Room. During a meeting, superheroes report back
on and release their completed Missions (if they had one) and acquire new Missions. Once a super-
hero has acquired a new Mission, they may leave the Secret Room, and spend more time discussing
world affairs. Once all superheroes have left the Secret Room, Professor Z ends the meeting and, at
some point after this, leaves the Mansion. The superheroes are then free to leave the Mansion and
complete their Missions. After completing a Mission, a superhero once more returns to the Mansion,
and the process begins again.
