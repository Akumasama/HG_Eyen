# HG Eyen

##Stuff to do
```
Time system
  @Starting cage timer
    As in HG, players appear in a temporal lobby waiting for more players [MAX:24,MIN:(?)] and
    voting for a map.
    DESIRED:"Voting scoreboard";
  
  @Trading period
    During "trading period" -Grace period- players should get the "trading coin" -slimeballs,gems,fish- and/or
    get items by:
    killing mobs, doing parkour to obtain: "keys" and/or open a special chest,solve
    puzzles to get rewards and fishing, yes fishing >.< this is aimed for noob players,
    there will be ZONES in the map for this purpose, 
    by "ZONES" i mean something like this: https://youtu.be/Kd1CZ8Dg3oI?t=2m55s 
    and this: https://youtu.be/s0mqOwNB69k?t=29s
    - this is a gameplay of my first adventure map :3 -
  
  @Fighting period
    After "Trading period" players will fight until there is one winner;
    if the number of players are less or equal to 4 or finished the third day, players: 
    "must be teleported to the deathmatch, into a different place";
    When a player is killed it becomes a chest containing his/her stuff, but this chest must be opened by-and-only-by
    right click >.<
  
```

```
Trading system
  @How do we trade? Players? NPC's? Market?
    I was thinking using NPC's but, this could bring some issues:
      *I setup villaguer's inventory using mc 1.8 features and i'm not sure if this could bring issues using
      bukkit 1.7.x + spigot/craftbukkit 1.8.
      *Could be tedious walk to the villaguer's town to trade.
    So, there could be -during trading period- an item in player's inventory to trade directly with
    the system.
      *Can be a trade system configurable via an external file? (.yml)
      
      
  @What do we trade?
   Slimeballs or gems and fish.
  
  @How do we get this thing that we trade?
    *Killing mobs.
    *Doing parkour.
    *Solving puzzles.
    *Fishing.
```

```
Game mechanics
  @Do chests have randomized loot or not?
    -Yes, but i think that we can use determined "Sets" of items for different circuits.
      e.g. Solving puzzles we can use the set: A=Armor items. 
        A:[{item1:propieties:{a,b,c}},{item2:propieties:{a,b,c}},..{item(n):{propieties:a,b,c}}]
      Doing parkour: B=Weapon items.
       B:[{item1:propieties:{a,b,c}},{item2:propieties:{a,b,c}},..{item(n):{propieties:a,b,c}}]
      
  @What happens when the game ends?
    *People are teleported to "General Lobby".
    
  @When will the game end?
    *When there is only one player alive.
    
  @Do we have special items? (Lighting sword or something like that)
    *To be honest i have no clue, can you give me some ideas for special items? :)
      On Olimpo HG are special items like, lighting rods, inksac  that blinds a random player,
      bricks to restore the entire hunger bar, "special" golden apples, Hay Bale that spawns horses,
      Glass Bottle to get invisibility, and so on!
```

```
Lobby(?)
  @Teleporting players to specific places when the game starts
    Yes, can be this configurable via an external file? (.yml)
  
  @Can players do something in the lobby?
   -I have no ideas for the "General Lobby" at the moment.
   -In the temporal lobby, before the game starts,players are waiting and voting for a map.
```

```
Extra Stuff
  +Can i have player stats?
    e.g.
    /stats <name>
      Console output:
        Kills:X, Deaths:Y, Wins:Z and "Difference":(Kills-Deaths)
        Do you have a better name for "Difference" stat? xD
  +Can i have a "reward system"?
    e.g.
    When a player kills another player receives gold as reward.  
```
