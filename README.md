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
We can see the diagram below to have a clear vision.
    <img width="555" alt="image" src="https://user-images.githubusercontent.com/111235521/229538033-6f359aec-fad1-4ad5-a8d7-bf59c70b815e.png">



### Acceptance criteria
1. Superheroes may only leave the Mansion after first leaving the Secret Room.
2. Superheroes can only acquire or release Missions while they are in the Secret Room and a meet-
ing is in progress.
3. A Superhero may only have one Mission (completed or uncompleted) at a time.
4. Superheros who are currently on a Mission will not return to the Mansion until it is complete.
5. Not all superheroes are required to be in the Mansion before a meeting can start.
6. A pair of Rosters, for new and completed Missions respectively, is used to handle Missions dur-
ing a meeting.
7. Professor Z does not need to enter or leave the Secret Room; they only need to be in the Man-
sion in order to start a meeting.
8. Professor Z does not leave the mansion while a meeting is in progress.

### Final result example
Because in concurrency environment, the results for each running are totally different. I just share a part of result screenshot to prove that it meets the requirment.
    <img width="716" alt="image" src="https://user-images.githubusercontent.com/111235521/229539970-30b3f1c3-dbcd-4dfa-a4c2-27e863ff4f9c.png">
